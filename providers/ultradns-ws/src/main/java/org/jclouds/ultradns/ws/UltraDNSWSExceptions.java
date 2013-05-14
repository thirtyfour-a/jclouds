/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.ultradns.ws;

import org.jclouds.rest.InsufficientResourcesException;

/**
 * Exceptions likely to be encountered when using {@link UltraDNSWSApi}
 * 
 * @author Adrian Cole
 */
public interface UltraDNSWSExceptions {

   /**
    * The Zone or other resource already exists
    */
   public static class ResourceAlreadyExistsException extends IllegalStateException {
      private static final long serialVersionUID = 1L;

      public ResourceAlreadyExistsException(String message, Throwable cause) {
         super(message, cause);
      }
   }
   
   /**
    * Error 7021: Geolocation/Source IP overlap(s) found: Region: Utah (Group: US )
    */
   public static class DirectionalGroupOverlapException extends IllegalStateException {
      private static final long serialVersionUID = 1L;

      public DirectionalGroupOverlapException(String message, Throwable cause) {
         super(message, cause);
      }
   }

   /**
    * Error 9010: Ultra API only allows 3 concurrent transactions per user
    */
   public static class TooManyTransactionsException extends InsufficientResourcesException {
      private static final long serialVersionUID = 1L;

      public TooManyTransactionsException(String message, Throwable cause) {
         super(message, cause);
      }
   }
}