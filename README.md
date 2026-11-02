# ClasificadorUsuarios

Proyecto del reto "Diseño de algoritmo con estructuras anidadas en Java", del curso Fundamentos de Programación.

El programa recibe la **edad** de un usuario y su **tipo de suscripción** (gratuita o premium), y devuelve la categoría de edad y el nivel de acceso que le corresponde.

## Categorías

| Categoría | Rango de edad |
|---|---|
| Niño | 0 a 11 años |
| Adolescente | 12 a 17 años |
| Adulto | 18 a 59 años |
| Adulto mayor | 60 años o más |

## Requisitos

- JDK 17 o superior (probado con JDK 21).
- Eclipse o IntelliJ IDEA (opcional, para ejecutar pruebas).
- JUnit 5 (solo para las pruebas).

## Estructura del proyecto

```
ClasificadorUsuarios/
├── src/
│   ├── ClasificadorUsuarios.java       # Lógica de clasificación
│   └── ClasificadorUsuariosTest.java   # 10 casos de prueba (JUnit 5)
├── pseudocodigo/
│   └── ClasificadorUsuarios.psc        # Pseudocódigo en PSeInt (genera el diagrama de flujo)
├── docs/
│   └── Informe_ClasificadorUsuarios.pdf
├── CHANGELOG.md
└── README.md
```

## Compilación y ejecución

Abre una terminal en la carpeta del proyecto.

**Compilar:**

```
javac -d bin src/ClasificadorUsuarios.java
```

**Ejecutar el ejemplo:**

```
java -cp bin ClasificadorUsuarios
```

Salida esperada:

```
Nino - Acceso gratuito infantil
Adulto mayor - Acceso premium preferencial
```

## Ejecución de las pruebas

### En Eclipse

1. Crea un proyecto Java llamado `ClasificadorUsuarios`.
2. Copia los archivos de la carpeta `src` dentro de `src` del proyecto.
3. Clic derecho en el proyecto → **Build Path → Add Libraries → JUnit → JUnit 5**.
4. Clic derecho en `ClasificadorUsuariosTest.java` → **Run As → JUnit Test**.

### En IntelliJ IDEA

1. Abre la carpeta del proyecto.
2. Si aparece el aviso de JUnit, pulsa **Alt + Enter** y elige **Add JUnit 5 to classpath**.
3. Clic derecho en `ClasificadorUsuariosTest.java` → **Run 'ClasificadorUsuariosTest'**.

### Desde la terminal (con JUnit Platform Console Standalone)

```
javac -cp junit-platform-console-standalone.jar -d bin src/*.java
java -jar junit-platform-console-standalone.jar -cp bin --select-class ClasificadorUsuariosTest
```

## Resultados de las pruebas

Los 10 casos de prueba pasaron (10 exitosos, 0 fallidos). El detalle está en el informe, sección 5.

## Documentación

El informe completo, con justificación teórica, diseño algorítmico, implementación, pruebas, discusión y conclusiones, está en `docs/Informe_ClasificadorUsuarios.pdf`.

## Autora

Lizney Bolaño — Ingeniería Industrial, Corporación Universitaria Americana.
