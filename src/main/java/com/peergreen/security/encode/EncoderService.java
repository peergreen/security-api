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

package com.peergreen.security.encode;

/**
 * Encode and decode a {@literal byte[]} value into/to a String for storage.
 * Example encoders could be:
 * <ul>
 *     <li>base64 encoder: stores using the Base64 format</li>
 *     <li>hexa encoder: stores using a simple hexadecimal form</li>
 *     <li>text encoder: interpret the array as a String value</li>
 * </ul>
 *
 * Encoders are registered as OSGi service with the {@literal encoder.format} service property.
 * this property can contains either a {@literal java.lang.String} or a {@literal java.lang.String[]} (array).
 *
 * @see <a href="http://en.wikipedia.org/wiki/Base64">Base 64</a>
 * @since 1.0
 */
public interface EncoderService {
    String ENCODER_FORMAT = "encoder.format";
    String encode(byte[] value);
    byte[] decode(String value);
}
