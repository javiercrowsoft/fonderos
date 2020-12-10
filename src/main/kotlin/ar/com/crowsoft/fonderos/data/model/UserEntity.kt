package ar.com.crowsoft.fonderos.data.model

import javax.persistence.*

@Entity
@Table(name = "users")
class UserEntity(
        var name: String,
        var nick: String,
        var email: String,
        @Id @GeneratedValue(strategy = GenerationType.AUTO)
        val id: Int = -1) {

    private constructor(): this("", "", "")
}