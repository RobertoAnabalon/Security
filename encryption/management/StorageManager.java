public class StorageManager {
    private EncryptionContext encryptionContext;
    private LockManager lockManager;

    public StorageManager(EncryptionContext encryptionContext, LockManager lockManager) {
        this.encryptionContext = encryptionContext;
        this.lockManager = lockManager;
    }

    public void storeData(String key, String data, EncryptionAlgorithm algorithm) {
        // asegurar los recursos
        lockManager.acquireLock(key);
        encryptionContext.setAlgorithm(algorithm);
        String encryptedData = encryptionContext.encryptData(data);
        // guardar el 'encryptedData'
        System.out.println("Storing encrypted data: " + encryptedData);
        lockManager.releaseLock(key);
    }

    public String retrieveData(String key, EncryptionAlgorithm algorithm) {
        lockManager.acquireLock(key);
        encryptionContext.setAlgorithm(algorithm);
        // recuperacion de el dato cifrado (ya  recuperado)
        String encryptedData = "encrypted_data_from_storage";
        String decryptedData = encryptionContext.decryptData(encryptedData);
        lockManager.releaseLock(key);
        return decryptedData;
    }
}
