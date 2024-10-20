public class EncryptionContext {
    private EncryptionAlgorithm algorithm;

    // Método para setear el algoritmo
    public void setAlgorithm(EncryptionAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    // Delegar las operaciones de cifrado y descifrado al algoritmo elegido
    public String encryptData(String data) {
        return algorithm.encrypt(data);
    }

    public String decryptData(String data) {
        return algorithm.decrypt(data);
    }
}
