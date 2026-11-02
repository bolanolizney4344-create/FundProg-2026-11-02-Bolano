# Registro de cambios

Todos los cambios importantes de este proyecto se documentan en este archivo.

## [1.0.0] - 2026-11-01

### Agregado
- Método `clasificar(int edad, String suscripcion)` con condicionales anidadas.
- Validación de edad negativa y de suscripción nula o no válida.
- Clasificación en cuatro categorías de edad: niño, adolescente, adulto y adulto mayor.
- Niveles de acceso para suscripción gratuita y premium.
- 10 casos de prueba unitarios con JUnit 5, enfocados en los límites de edad.
- Documentación JavaDoc en las clases y métodos.
- Informe final en PDF con pseudocódigo, diagrama de flujo, pruebas y recomendaciones.
- README.md con instrucciones de compilación y ejecución.

### Notas
- Los 10 casos de prueba pasaron en la ejecución del programa de verificación.
- Pendiente para futuras versiones: separar la lógica de edad en su propio método, usar enum para categorías y suscripciones, y validar una edad máxima.
