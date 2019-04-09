// Databricks notebook source
   val configs = Map(
  "fs.azure.account.auth.type" -> "OAuth",
  "fs.azure.account.oauth.provider.type" -> "org.apache.hadoop.fs.azurebfs.oauth2.ClientCredsTokenProvider",
  "fs.azure.account.oauth2.client.id" -> "d320266f-1f18-4223-b140-e0b856592bbb",
  "fs.azure.account.oauth2.client.secret" -> "CmjuUwVVrU6PqXvWn2GJpm+czdGOn5Aa/yQl9lHATX8=",
  "fs.azure.account.oauth2.client.endpoint" -> "https://login.microsoftonline.com/b7f604a0-00a9-4188-9248-42f3a5aac2e9/oauth2/token")

// Optionally, you can add <your-directory-name> to the source URI of your mount point.
dbutils.fs.mount(
  source = "abfss://absitdsdevwussa001@absitdsdevwussa001.dfs.core.windows.net/databricks",
  mountPoint = "/mnt/databricks/",
  extraConfigs = configs)


// COMMAND ----------

