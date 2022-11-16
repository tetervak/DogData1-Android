package ca.tetervak.dogdata1

import androidx.lifecycle.ViewModel
import ca.tetervak.dogdata1.model.Dog
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel: ViewModel() {

    private val dogList: List<Dog> = listOf(
        Dog(
            name = "Koda",
            age = 2,
            hobbies = "Eating treats on the terrace",
            picture = "koda.jpg"
        ),
        Dog(
            name = "Lola",
            age = 16,
            hobbies = "Barking at Daddy",
            picture = "lola.jpg"
        ),
        Dog(
            name = "Frankie",
            age = 2,
            hobbies = "Stealing socks",
            picture = "frankie.jpg"
        ),
        Dog(
            name = "Nox",
            age = 8,
            hobbies = "Meeting new animals",
            picture = "nox.jpg"
        ),
        Dog(
            name = "Faye",
            age = 8,
            hobbies = "Digging in the garden",
            picture = "faye.jpg"
        ),
        Dog(
            name = "Bella",
            age = 14,
            hobbies = "Chasing sea foam",
            picture = "bella.jpg"
        ),
        Dog(
            name = "Moana",
            age = 2,
            hobbies = "Bothering her paw-rents",
            picture = "moana.jpg"
        ),
        Dog(
            name = "Tzeitel",
            age = 7,
            hobbies = "Sunbathing",
            picture = "tzeitel.jpg"
        ),
        Dog(
            name = "Leroy",
            age = 4,
            hobbies = "Sleeping in dangerous places",
            picture = "leroy.jpg"
        )
    )

    private val _flowDogList = MutableStateFlow(dogList)
    val flowDogList: StateFlow<List<Dog>> = _flowDogList.asStateFlow()
}