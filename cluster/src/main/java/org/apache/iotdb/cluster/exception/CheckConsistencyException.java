/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.iotdb.cluster.exception;

/**
 * Raised when check consistency failed, now only happens if there is a strong-consistency and
 * syncLeader failed
 */
public class CheckConsistencyException extends Exception {

  public CheckConsistencyException(String errMag) {
    super(String.format("check consistency failed, error message=%s ", errMag));
  }

  public static CheckConsistencyException CHECK_STRONG_CONSISTENCY_EXCEPTION = new CheckConsistencyException(
      "strong consistency, sync with leader failed");
}