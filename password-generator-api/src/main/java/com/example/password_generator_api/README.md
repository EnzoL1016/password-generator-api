# Password Generator API

![Java](https://img.shields.io/badge/Java-17-blue) ![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-green) ![Render](https://img.shields.io/badge/Desplegado%20en-Render-blue)

Una API RESTful construida con **Spring Boot** que genera contraseñas personalizables basadas en parámetros definidos por el usuario, como la longitud, la inclusión de letras mayúsculas, minúsculas, números y caracteres especiales. Este proyecto demuestra buenas prácticas de código limpio, diseño de API y la integración con Swagger para la documentación de la API.

## 🚀 Demo en Vivo
La API está desplegada en Render y puede ser accedida en:  
👉 **[https://password-generator-api.onrender.com](https://password-generator-api.onrender.com)** 

Explora la documentación de la API usando Swagger UI:  
👉 **[https://password-generator-api.onrender.com/swagger-ui.html](https://password-generator-api.onrender.com/swagger-ui.html)** 

## 📋 Características
- Genera contraseñas aleatorias con parámetros personalizables:
    - Longitud de la contraseña
    - Incluir letras mayúsculas (A-Z)
    - Incluir letras minúsculas (a-z)
    - Incluir números (0-9)
    - Incluir caracteres especiales (!@#$%^&*()_+-=[]{}|;:,.<>?)
- Validación de entrada para asegurar que se seleccione al menos un tipo de carácter y que la longitud sea válida.
- Documentación de la API con Swagger (OpenAPI).
- Desplegada en Render para acceso público.

## 🛠️ Tecnologías Utilizadas
- **Lenguaje**: Java 17
- **Framework**: Spring Boot 3.4.4
- **Herramienta de Construcción**: Maven
- **Documentación**: Springdoc OpenAPI (Swagger)
- **Despliegue**: Render
