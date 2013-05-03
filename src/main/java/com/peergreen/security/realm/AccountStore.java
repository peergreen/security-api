package com.peergreen.security.realm;

import java.util.Set;

/**
 * User: guillaume
 * Date: 30/04/13
 * Time: 17:03
 */
public interface AccountStore {

    /**
     * Service property identifying a store
     */
    String STORE_NAME = "store.name";

    Set<AccountInfo> getAccounts(AccountFilter filter);
}
