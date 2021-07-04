package deneno.wtf.entities

import javax.persistence.*

@Entity
@Table(name = "pet", schema = "public", catalog = "testdatabase")
open class PetEntity {
    @get:Id
    @get:Column(name = "id", nullable = false)
    var id: Int? = null

    @get:Basic
    @get:Column(name = "name", nullable = true)
    var name: String? = null

    @get:Basic
    @get:Column(name = "personid", nullable = false, insertable = false, updatable = false)
    var personid: Int? = null

    @get:ManyToOne(fetch = FetchType.LAZY)
    @get:JoinColumn(name = "personid", referencedColumnName = "id")
    var refPersonEntity: PersonEntity? = null

    override fun toString(): String =
        "Entity of type: ${javaClass.name} ( " +
                "id = $id " +
                "name = $name " +
                "personid = $personid " +
                ")"

    // constant value returned to avoid entity inequality to itself before and after it's update/merge
    override fun hashCode(): Int = 42

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false
        other as PetEntity

        if (id != other.id) return false
        if (name != other.name) return false
        if (personid != other.personid) return false

        return true
    }

}

