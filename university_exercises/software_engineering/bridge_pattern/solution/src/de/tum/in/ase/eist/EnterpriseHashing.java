package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing{
    @Override
    public String hashDocument(String input) {
            CryptoSecureHashAlgorithm cryptoSecureHashAlgorithm = new CryptoSecureHashAlgorithm();
            return cryptoSecureHashAlgorithm.calculateHashCode(input);
    }
}
