package softwarebackend

//Usuario general que va a tener las propiedades de los demás usuarios
class Usuario {

    //atributos del usuario
    String username
    String password
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired
    String name
    String codigo
    String correo

    //valir los atributos del usuario
    static constraints = {

        //validar los atributos del usuario
        username nullable: false, blank: false, unique: true
        name nullable: false, blank: false, unique: true
        correo nullable: false, blank: false, unique: true
        codigo nullable: false, blank: false, unique:  true
        password nullable: false, blank: false, password: true

    }
}
