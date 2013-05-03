package com.peergreen.security.realm.manager;

/**
 * User: guillaume
 * Date: 02/05/13
 * Time: 11:47
 */
public interface ServiceHandle<T> {
    T get();
    void release();
}
