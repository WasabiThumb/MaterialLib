package xyz.wasabicodes.matlib.util;

import org.jetbrains.annotations.NotNull;

import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5NullOutputStream extends OutputStream {

    private final MessageDigest md;
    public MD5NullOutputStream() {
        try {
            this.md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("MD5 digest not found", e);
        }
    }

    public byte[] digest() {
        return this.md.digest();
    }

    @Override
    public void write(int i) {
        this.md.update((byte) i);
    }

    @Override
    public void write(byte @NotNull [] bytes) {
        this.md.update(bytes);
    }

    @Override
    public void write(byte @NotNull [] bytes, int off, int len) {
        this.md.update(bytes, off, len);
    }

}
