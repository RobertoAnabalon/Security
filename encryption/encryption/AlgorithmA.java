public class AlgorithmA implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        // Implementar lógica de cifrado de tipo A
        return "encryptedA:" + data;
    }

    @Override
    public String decrypt(String data) {
        // Implementar lógica de descifrado de tipo A
        return data.replace("encryptedA:", "");
    }
}

