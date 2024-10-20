public class AlgorithmC implements EncryptionAlgorithm {
    @Override
    public String encrypt(String data) {
        // Implementar lógica de cifrado de tipo C
        return "encryptedC:" + data;
    }

    @Override
    public String decrypt(String data) {
        // Implementar lógica de descifrado de tipo C
        return data.replace("encryptedC:", "");
    }
}