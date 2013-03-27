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

package com.peergreen.security.hash;

/**
 * Produces hashes of clear text such as passwords, ...
 */
public interface HashService {

    /**
     * HashService are registered as OSGi service with the {@literal hash.name} service property.
     * this property can contains either a {@literal java.lang.String} or a {@literal java.lang.String[]} (array).
     * {@value}
     */
    String HASH_NAME_PROPERTY = "hash.name";

    /**
     * Generate a hash from the clear text value provided.
     * It generates a salt randomly and encode the clear text using a cryptographic algorithm.
     * This method is typically used when creating new user (need to hash its given password for storage).
     * @param clear clear text value
     * @return hashed value + salt + algorithm
     */
    Hash generate(String clear);

    /**
     * Generate a hash from the clear text value provided.
     * It uses the given salt and encode the clear text using a cryptographic algorithm.
     * This method is typically used when creating new user (need to hash its given password for storage).
     * @param clear clear text value
     * @param salt salt value
     * @return hashed value + salt + algorithm
     */
    Hash generate(String clear, byte[] salt);

    /**
     * Build a hash from encoded values (encrypted password and salt).
     *
     * This method is typically used when loading stored hashes.
     * @param encoder Name of the encoder to use to decode the given encoded value(s), if {@literal null}, the
     *                default encoder (for this hash type) will be used.
     * @param encoded encoded and encrypted value(s)
     * @return a {@link Hash} usable for validating a clear password
     * @throws HashException when this service cannot decode and parse the given value(s)
     */
    Hash build(String encoder, String encoded) throws HashException;

    /**
     * Validate the given clear text against the given {@link Hash}.
     * @param clear clear text value
     * @param hash encrypted value + salt
     * @return {@literal true} is the clear text matches the {@link Hash}, {@literal false} otherwise.
     */
    boolean validate(String clear, Hash hash);
}
