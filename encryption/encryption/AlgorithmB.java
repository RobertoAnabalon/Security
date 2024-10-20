public class AlgorithmB implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        // Implementar lógica de cifrado de tipo B
        return "encryptedB:" + data;
    }

    @Override
    public String decrypt(String data) {
        // Implementar lógica de descifrado de tipo B
        return data.replace("encryptedB:", "");
    }
}