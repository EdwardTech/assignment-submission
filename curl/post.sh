curl -v -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -H "Accept: application/json" \
  -d '{"username": "Eric", "password": "admin228"}'
echo