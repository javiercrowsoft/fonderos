package ar.com.crowsoft.fonderos.data.service

import ar.com.crowsoft.fonderos.core.model.User
import ar.com.crowsoft.fonderos.core.model.exception.ResourceNotFoundException
import ar.com.crowsoft.fonderos.core.service.UserService
import ar.com.crowsoft.fonderos.data.model.UserEntity
import ar.com.crowsoft.fonderos.data.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserServiceImpl : UserService {

    @Autowired
    lateinit var userRepository: UserRepository

    override fun create(user: User): UserEntity {
        return userRepository.save(UserEntity(user.name, user.nick, user.email))
    }

    override fun delete(id: Int) {
        userRepository.delete(get(id))
    }

    override fun update(id: Int, user: User): UserEntity {
        val userEntity = userRepository.findById(id)
        return userEntity.map { e ->
            e.name = user.name
            userRepository.save(e)
        }.orElseThrow {
            ResourceNotFoundException("There is not a user with id $id")
        }
    }

    override fun get(id: Int): UserEntity {
        return userRepository.findById(id).orElseThrow {
            ResourceNotFoundException("There is not a user with id $id")
        }
    }

    override fun findAll(): Iterable<UserEntity> {
        return userRepository.findAll()
    }

}