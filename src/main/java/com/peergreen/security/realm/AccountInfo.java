package com.peergreen.security.realm;

import java.util.Collection;
import java.util.UUID;

/**
 * User: guillaume
 * Date: 24/04/13
 * Time: 19:08
 */
public interface AccountInfo {
    String getLogin();
    Collection<String> getRoles();
    boolean isActivated();
}
