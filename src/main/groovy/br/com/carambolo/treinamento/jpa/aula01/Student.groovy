package br.com.carambolo.treinamento.jpa.aula01

import javax.persistence.CollectionTable
import javax.persistence.Column
import javax.persistence.ElementCollection
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "students")
class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id
    String name
    String email

    @Column(name="file_name")
    @ElementCollection
    @CollectionTable(name="images")
    List<String> images = new ArrayList<>()
}
