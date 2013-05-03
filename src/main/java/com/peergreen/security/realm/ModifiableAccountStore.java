package com.peergreen.security.realm;

import java.util.Collection;
import java.util.UUID;

import com.peergreen.security.hash.Hash;

/**
 * Define a realm
 */
public interface ModifiableAccountStore extends AccountStore {

    void createAccount(String id, String password) throws AccountStoreException;
    boolean suppressAccount(String id) throws AccountStoreException;

    void activateAccount(String id) throws AccountStoreException;
    void deactivateAccount(String id) throws AccountStoreException;

    AccountInfo getAccountInfo(String id);

    void setPassword(String id, String password) throws AccountStoreException;

    void setLogin(String id, String newLogin) throws AccountStoreException;

    void addRoles(String id, Collection<String> roles) throws AccountStoreException;
    void removeRole(String id, Collection<String> roles) throws AccountStoreException;
}
