/*
 * Sonatype Nexus (TM) Open Source Version
 * Copyright (c) 2007-2015 Sonatype, Inc.
 * All rights reserved. Includes the third-party code listed at http://links.sonatype.com/products/nexus/oss/attributions.
 *
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License Version 1.0,
 * which accompanies this distribution and is available at http://www.eclipse.org/legal/epl-v10.html.
 *
 * Sonatype Nexus (TM) Professional Version is available from Sonatype, Inc. "Sonatype" and "Sonatype Nexus" are trademarks
 * of Sonatype, Inc. Apache Maven is a trademark of the Apache Software Foundation. M2eclipse is a trademark of the
 * Eclipse Foundation. All other trademarks are the property of their respective owners.
 */
package org.sonatype.nexus.ant.staging;

/**
 * DTO for Nexus connection.
 *
 * @author cstamas
 */
public class ConnectionInfo
{
  private String baseUrl;

  private Authentication authentication;

  private Proxy proxy;

  // attributes

  public String getBaseUrl() {
    return baseUrl;
  }

  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }

  // children/refs

  public Authentication getAuthentication() {
    return authentication;
  }

  public void add(Authentication authentication) {
    this.authentication = authentication;
  }

  public Proxy getProxy() {
    return proxy;
  }

  public void add(Proxy proxy) {
    this.proxy = proxy;
  }
}
