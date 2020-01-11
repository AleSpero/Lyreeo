package com.sperolabs.lyreeo.models

import io.realm.RealmList
import io.realm.RealmObject

class Section(
    val name : String,
    val verses : RealmList<Verse>
) : RealmObject()