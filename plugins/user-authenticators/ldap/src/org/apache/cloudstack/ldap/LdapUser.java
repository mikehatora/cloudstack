// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package org.apache.cloudstack.ldap;

public class LdapUser implements Comparable<LdapUser> {
	private final String email;
	private final String principal;
	private final String firstname;
	private final String lastname;
	private final String username;

	public LdapUser(final String username, final String email,
			final String firstname, final String lastname,
			final String principal) {
		this.username = username;
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.principal = principal;
	}

	@Override
	public int compareTo(final LdapUser other) {
		return getUsername().compareTo(other.getUsername());
	}

	@Override
	public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (other instanceof LdapUser) {
			final LdapUser otherLdapUser = (LdapUser) other;
			return getUsername().equals(otherLdapUser.getUsername());
		}
		return false;
	}

	public String getEmail() {
		return email;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getPrincipal() {
		return principal;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public int hashCode() {
		return getUsername().hashCode();
	}
}