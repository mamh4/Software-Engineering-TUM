package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing{
    @Override
    public String hashDocument(String input) {
        if (input.length() > 1000) {
            throw new IllegalArgumentException();
        } else {
            SimpleHashAlgorithm simpleHashAlgorithm = new SimpleHashAlgorithm();
            return simpleHashAlgorithm.calculateHashCode(input);
        }
    }
}
