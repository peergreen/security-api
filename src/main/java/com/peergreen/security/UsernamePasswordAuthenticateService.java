/*
 * Copyright 2013 Peergreen SAS
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.peergreen.security;

import javax.security.auth.Subject;

/**
 *
 * @since 1.0
 */
public interface UsernamePasswordAuthenticateService {
    /**
     * Authenticate the given user with the given credentials.
     *
     * @param username Identify the persona to be logged in
     * @param password Hashed password to be verified
     * @return a read-only {@link Subject} if authentication succeed, {@literal null} otherwise.
     */
    Subject authenticate(String username, String password);
}
