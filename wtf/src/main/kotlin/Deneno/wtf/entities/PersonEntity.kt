package deneno.wtf.entities

import javax.persistence.*

@Entity
@Table(name = "testdatabase", schema = "public", catalog = "testdatabase")
open class PersonEntity {
    @get:Id
    @get:Column(name = "id", nullable = false, insertable = false, updatable = false)
    var id: Int? = null

    @get:Basic
    @get:Column(name = "name", nullable = true)
    var name: String? = null

    @get:Basic
    @get:Column(name = "surname", nullable = true)
    var surname: String? = null

    @get:OneToMany(mappedBy = "refPersonEntity")
    var refPetEntities: List<PetEntity>? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "name = $name " +
                "surname = $surname " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as PersonEntity

        if (id != other.id) return false
        if (name != other.name) return false
        if (surname != other.surname) return false

        return true
    }

}

