package com.peergreen.security.realm.manager;

import java.util.List;

import com.peergreen.security.realm.AccountStore;

/**
 * Search registered AccountStore services (and subclass).
 */
public interface AccountStoreManager {
    <T extends AccountStore> ServiceHandle<T> findAccountStore(String name, Class<T> type);
    List<String> listStoreNames();
}
