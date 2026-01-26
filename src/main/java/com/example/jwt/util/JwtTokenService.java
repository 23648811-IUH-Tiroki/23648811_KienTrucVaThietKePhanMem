package com.example.jwt.util;

import java.io.InputStream;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.time.Instant;
import java.util.Base64;

import org.springframework.core.io.ClassPathResource;
import org.springframework.security.oauth2.jwt.*;

import com.nimbusds.jose.jwk.*;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;

public class JwtTokenService {

    public static String generateToken() throws Exception {

        RSAPrivateCrtKey privateKey = loadPrivateKey();
        RSAPublicKey publicKey = generatePublicKey(privateKey);

        RSAKey rsaKey = new RSAKey.Builder(publicKey)
                .privateKey(privateKey)
                .build();

        JwtEncoder encoder = new NimbusJwtEncoder(
                new ImmutableJWKSet<>(new JWKSet(rsaKey)));

        JwtClaimsSet claims = JwtClaimsSet.builder()
                .issuer("self")
                .subject("student")
                .issuedAt(Instant.now())
                .expiresAt(Instant.now().plusSeconds(3600))
                .build();

        return encoder.encode(
                JwtEncoderParameters.from(claims)
        ).getTokenValue();
    }

    private static RSAPrivateCrtKey loadPrivateKey() throws Exception {
        InputStream is = new ClassPathResource("keys/private.pem").getInputStream();
        String key = new String(is.readAllBytes())
                .replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replaceAll("\\s+", "");

        byte[] decoded = Base64.getDecoder().decode(key);
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(decoded);
        return (RSAPrivateCrtKey) KeyFactory.getInstance("RSA").generatePrivate(spec);
    }

    private static RSAPublicKey generatePublicKey(RSAPrivateCrtKey privateKey) throws Exception {
        RSAPublicKeySpec spec = new RSAPublicKeySpec(
                privateKey.getModulus(),
                privateKey.getPublicExponent()
        );
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(spec);
    }
}
