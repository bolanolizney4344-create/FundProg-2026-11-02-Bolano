Algoritmo ClasificadorUsuarios
	Definir edad Como Entero
	Definir suscripcion Como Cadena
	Escribir "Ingresa la edad:"
	Leer edad
	Escribir "Ingresa la suscripcion (gratuita o premium):"
	Leer suscripcion
	Si edad < 0 Entonces
		Escribir "ERROR: edad no valida"
	Sino
		Si suscripcion = "gratuita" Entonces
			Si edad < 12 Entonces
				Escribir "Nino - Acceso gratuito infantil"
			Sino
				Si edad < 18 Entonces
					Escribir "Adolescente - Acceso gratuito basico"
				Sino
					Si edad < 60 Entonces
						Escribir "Adulto - Acceso gratuito estandar"
					Sino
						Escribir "Adulto mayor - Acceso gratuito preferencial"
					FinSi
				FinSi
			FinSi
		Sino
			Si suscripcion = "premium" Entonces
				Si edad < 12 Entonces
					Escribir "Nino - Acceso premium infantil"
				Sino
					Si edad < 18 Entonces
						Escribir "Adolescente - Acceso premium completo"
					Sino
						Si edad < 60 Entonces
							Escribir "Adulto - Acceso premium completo"
						Sino
							Escribir "Adulto mayor - Acceso premium preferencial"
						FinSi
					FinSi
				FinSi
			Sino
				Escribir "ERROR: suscripcion no valida"
			FinSi
		FinSi
	FinSi
FinAlgoritmo