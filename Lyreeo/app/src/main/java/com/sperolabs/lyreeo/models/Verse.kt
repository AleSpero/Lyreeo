package com.sperolabs.lyreeo.models

import io.realm.RealmObject

class Verse(
    var textContent : String,
    var audioClip : Int //TODO pensa se usare un oggetto custom audioclip oppure usare qualcosa di già fatto
) : RealmObject()