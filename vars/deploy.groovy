def call()
{
  echo "deploying code..."
  sh "docker compose down && docker compose up -d"
}
