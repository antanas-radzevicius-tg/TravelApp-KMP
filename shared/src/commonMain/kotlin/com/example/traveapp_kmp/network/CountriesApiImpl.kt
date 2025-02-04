package com.example.traveapp_kmp.network

import com.example.traveapp_kmp.listing.Country
import com.example.traveapp_kmp.listing.TouristPlace
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*

class CountriesApiImpl : CountriesApi {
//    override suspend fun getCountriesList(): List<Country> {
//        return client.get {
//            countries("countrieslist")
//        }.body()
//    }
    override suspend fun getCountriesList(): List<Country> {
        return listOf(
            Country(
                name = "Japan",
                touristPlaces = listOf(
                    TouristPlace(
                        name = "Tokyo Skytree",
                        shortDescription = "The Tokyo Skytree is a towering communications and observation tower located in Tokyo, Japan. At 634 meters tall, it is the tallest structure in Japan and offers breathtaking views of the city from its observation deck.",
                        longDescription = "The Tokyo Skytree is a stunning architectural landmark located in the Sumida ward of Tokyo, Japan. Standing at 634 meters tall, it is the tallest structure in Japan and one of the tallest towers in the world. The tower was built as a communications tower, but it also features a large observation deck that offers breathtaking views of the city and beyond. Visitors to the Tokyo Skytree can take an elevator to the observation deck, which is located at a height of 450 meters. From here, they can enjoy 360-degree views of the city, including iconic landmarks such as Tokyo Tower and the Tokyo Metropolitan Government Building. On clear days, it is even possible to see as far as Mount Fuji, located over 100 kilometers away. In addition to the observation deck, the Tokyo Skytree also features a number of shops and restaurants, as well as a historical exhibit about the history and culture of the area. The tower is also a popular destination for night time views, as the city lights up below. Overall, the Tokyo Skytree is a must-visit destination for anyone traveling to Tokyo. Whether you're an architecture or history buff, or just looking for a stunning view, the tower is sure to impress.",
                        images = listOf(
                            "https://www.linkpicture.com/q/spencer-chow-1rTHCME6oQc-unsplash.jpg",
                            "https://www.linkpicture.com/q/alejandro-barba-meRWBak7OzY-unsplash-1.jpg",
                            "https://www.linkpicture.com/q/spencer-chow-1rTHCME6oQc-unsplash.jpg",
                            "https://www.linkpicture.com/q/elton-sa-ZjcWMONE5n8-unsplash.jpg",
                            "https://www.linkpicture.com/q/charles-postiaux-ITpyiDGXdYA-unsplash.jpg"
                        )
                    ),
                    TouristPlace(
                        name = "Fushimi Inari Taisha",
                        shortDescription = "Fushimi Inari Taisha is a famous Shinto shrine located in Kyoto, Japan, dedicated to the god of agriculture and prosperity, Inari. The shrine is known for its thousands of vermilion torii gates, which line the trails leading up to the main shrine buildings and offer a peaceful and scenic walk for visitors.",
                        longDescription = "Fushimi Inari Taisha is a Shinto shrine located in the Fushimi ward of Kyoto, Japan. It is one of the most popular tourist destinations in the city and is dedicated to Inari, the god of agriculture and prosperity. The shrine is known for its thousands of vermilion torii gates, which line the trails leading up to the main shrine buildings. The trails, known as the Senbon Torii, wind through the forested hills behind the shrine, offering a peaceful and scenic walk for visitors.The torii gates were donated by businesses and individuals who believed that the blessings of Inari would bring them success and prosperity. The trail leading up to the main shrine buildings is approximately 4 kilometers long and takes about 2-3 hours to complete, but visitors can choose to walk as far as they like. Along the way, there are smaller shrines and statues dedicated to Inari and other gods, as well as food stalls selling traditional Japanese treats. At the main shrine buildings, visitors can offer prayers and make offerings to Inari, and the shrine is a popular destination for those seeking blessings for business success and good fortune. The history of Fushimi Inari Taisha dates back to the 8th century, and it has been a place of worship for over 1,000 years. The shrine and its trails are a unique and breathtaking example of traditional Japanese culture and religion, and a must-visit for those traveling to Kyoto.",
                        images = listOf(
                            "https://www.linkpicture.com/q/tzepang-ngaa-wwcpaEnazmU-unsplash.jpg",
                            "https://www.linkpicture.com/q/richard-tao-XGvFfx25j7A-unsplash.jpg"
                        )
                    ),
                    TouristPlace(
                        name = "Mount Fuji",
                        shortDescription = "Mount Fuji is the highest mountain in Japan and a symbol of Japanese culture and history. It is a UNESCO World Heritage site and a popular destination for climbers and tourists alike.",
                        longDescription = "Mount Fuji is a stunning and iconic symbol of Japanese culture and history. Standing at 3,776 meters tall, it is the highest mountain in Japan and a UNESCO World Heritage site. Mount Fuji has been revered by the Japanese for centuries and is considered a sacred site by many. The mountain is located about 100 kilometers southwest of Tokyo and is easily visible from the city on a clear day. Mount Fuji is a popular destination for climbers and tourists, who come to experience its beauty and cultural significance. The climbing season typically runs from July to September, and the ascent is a challenging but rewarding experience for those who are prepared. Along the way, climbers can enjoy stunning views of the surrounding landscape and stop at mountain huts for rest and refreshment. For those who prefer not to climb, there are many observation points and cultural sites surrounding Mount Fuji, including the famous Lake Kawaguchiko and the historic town of Hakone. These areas offer spectacular views of the mountain and are popular tourist destinations in their own right. Overall, Mount Fuji is a must-visit destination for anyone traveling to Japan, offering a unique combination of natural beauty and cultural significance. Whether you climb to the summit or simply admire it from a distance, the experience is sure to be unforgettable.",
                        images = listOf(
                            "https://www.linkpicture.com/q/mike-prince-WLxQvbMyfas-unsplash.jpg",
                            "https://www.linkpicture.com/q/clay-banks-u27Rrbs9Dwc-unsplash.jpg",
                            "https://www.linkpicture.com/q/jj-ying-9Qwbfa_RM94-unsplash.jpg",
                            "https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg"
                        )
                    )
                )
            ),
            Country(
                name = "France",
                touristPlaces = listOf(
                    TouristPlace(
                        name = "Eiffel Tower",
                        shortDescription = "The Eiffel Tower is a landmark iron lattice tower located in Paris, France. Standing at 324 meters tall, it is the tallest structure in Paris and one of the most recognizable symbols of France.",
                        longDescription = "The Eiffel Tower is an iconic symbol of France and one of the most recognizable landmarks in the world. Located in Paris, the tower stands at 324 meters tall and was built as the centerpiece of the 1889 Exposition Universelle, a world's fair held in Paris to commemorate the 100th anniversary of the French Revolution. Designed by Gustave Eiffel, the tower is constructed of iron lattice work and was the tallest structure in the world when it was completed. Today, the Eiffel Tower is one of the most popular tourist destinations in Paris, attracting millions of visitors each year. Visitors can take the stairs or an elevator to the top of the tower, where they can enjoy stunning views of Paris and its landmarks, including the Seine River, Notre-Dame Cathedral, and the Louvre Museum. The tower is also a popular spot for picnics and romantic evenings, as the city lights up below. In addition to its stunning views, the Eiffel Tower is also an important cultural and historical landmark, representing the technological achievements of the late 19th century and serving as a symbol of France and Paris for over a century. Overall, the Eiffel Tower is a must-visit destination for anyone traveling to Paris, offering a unique combination of natural beauty, cultural significance, and breathtaking views of the city.",
                        images = listOf(
                            "https://www.linkpicture.com/q/denys-nevozhai-UzagqG756OU-unsplash.jpg",
                            "https://www.linkpicture.com/q/alejandro-barba-meRWBak7OzY-unsplash-1_1.jpg",
                            "https://www.linkpicture.com/q/dan-novac-jpZjopNjtWE-unsplash.jpg",
                            "https://www.linkpicture.com/q/charles-postiaux-ITpyiDGXdYA-unsplash_1.jpg",
                            "https://www.linkpicture.com/q/grillot-edouard-AvAP937OJR8-unsplash.jpg",
                            "https://www.linkpicture.com/q/anthony-delanoix-Q0-fOL2nqZc-unsplash.jpg"
                        )
                    ),
                    TouristPlace(
                        name = "Mont Saint Michel",
                        shortDescription = "Mont Saint Michel is a stunning island commune located in Normandy, France. It is famous for its historic abbey and its picturesque setting, surrounded by sandbanks and the sea.",
                        longDescription = "Mont Saint Michel is a breathtaking island commune located in Normandy, France. The island is famous for its historic abbey, which sits atop a rocky outcropping and is surrounded by sandbanks and the sea. The abbey is one of the most recognizable landmarks in France and is considered one of the country's greatest architectural wonders. The history of Mont Saint Michel dates back over a thousand years, and the island has served as a pilgrimage site, a fortress, and a prison over the centuries. Today, the abbey is a museum, and visitors can tour the impressive building and admire its gothic architecture, stained glass windows, and elaborate carvings. In addition to the abbey, Mont Saint Michel is also known for its picturesque setting and its stunning natural beauty. The island is surrounded by vast sandbanks that are covered in water during high tide and exposed during low tide. Visitors can explore the island's narrow streets and alleyways, visit its shops and restaurants, and enjoy breathtaking views of the sea and the surrounding landscape. Whether you're a history buff, an architecture lover, or just looking for a unique natural wonder, Mont Saint Michel is a must-visit destination in Normandy, France. With its rich history, stunning architecture, and breathtaking setting, Mont Saint Michel is sure to leave a lasting impression on visitors.",
                        images = listOf(
                            "https://www.linkpicture.com/q/dan-asaki-ZFZ5AyPg3rE-unsplash.jpg",
                            "https://www.linkpicture.com/q/gautier-salles-5VMqvn-60to-unsplash.jpg",
                            "https://www.linkpicture.com/q/moerwijk-70wrfCyMvbE-unsplash.jpg",
                            "https://www.linkpicture.com/q/vladimir-haltakov-PMfuunAfF2w-unsplash.jpg"
                        )
                    )
                )
            )
        )
    }

    private val client = HttpClient {
        expectSuccess = true
        install(HttpTimeout) {
            val timeout = 30000L
            connectTimeoutMillis = timeout
            requestTimeoutMillis = timeout
            socketTimeoutMillis = timeout
        }
        install(ContentNegotiation) {
            json()
        }
    }

    private fun HttpRequestBuilder.countries(path: String) {
        url {
            takeFrom("http://127.0.0.1:3001/")
            encodedPath = path
        }
    }
}