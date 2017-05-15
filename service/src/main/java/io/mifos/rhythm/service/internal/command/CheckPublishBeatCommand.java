/*
 * Copyright 2017 The Mifos Initiative.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.mifos.rhythm.service.internal.command;

import java.time.LocalDateTime;

/**
 * @author Myrle Krantz
 */
public class CheckPublishBeatCommand {
  private final String tenantIdentifier;
  private final String applicationName;
  private final String beatIdentifier;
  private final LocalDateTime publishedSince;

  public CheckPublishBeatCommand(
          final String tenantIdentifier,
          final String applicationName,
          final String beatIdentifier,
          final LocalDateTime publishedSince) {
    this.tenantIdentifier = tenantIdentifier;
    this.applicationName = applicationName;
    this.beatIdentifier = beatIdentifier;
    this.publishedSince = publishedSince;
  }

  public String getTenantIdentifier() {
    return tenantIdentifier;
  }

  public String getApplicationName() {
    return applicationName;
  }

  public String getBeatIdentifier() {
    return beatIdentifier;
  }

  public LocalDateTime getPublishedSince() {
    return publishedSince;
  }
}
