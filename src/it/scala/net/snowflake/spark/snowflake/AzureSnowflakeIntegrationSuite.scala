/*
 * Copyright 2015-2016 Snowflake Computing
 * Copyright 2015 Databricks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.snowflake.spark.snowflake

/**
  * This suite is basically running all tests in SnowflakeIntegrationSuite but
  * with a different config. The config would be azure specific
  *
  * Created by linchan on 9/13/17.
  */
class AzureSnowflakeIntegrationSuite extends SnowflakeIntegrationSuite {

  IS_AZURE = true

  override def beforeAll(): Unit = {
    super.beforeAll()

    // do nothing
  }
}
