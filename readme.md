## spring boot CF http
to run : 
gcloud functions deploy function-upperCase --entry-point org.springframework.cloud.function.adapter.gcp.GcfJarLauncher --runtime java17 --trigger-http --source target/deploy --memory 512MB