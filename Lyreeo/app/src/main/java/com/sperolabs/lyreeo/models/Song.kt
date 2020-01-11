package com.sperolabs.lyreeo.models

import io.realm.RealmList
import io.realm.RealmObject

class Song(
    val id: Long,
    var title : String,
    var genres : RealmList<String>, //hmm
    val tempo : Int,
    var section: RealmList<Section>
) : RealmObject()
