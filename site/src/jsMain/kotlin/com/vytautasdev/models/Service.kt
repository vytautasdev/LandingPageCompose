package com.vytautasdev.models


import com.vytautasdev.utils.Constants.LOREM_IPSUM_SHORTEST
import com.vytautasdev.utils.Res

enum class Service(
    val icon: String,
    val iconDesc: String,
    val title: String,
    val description: String
) {
    Android(
        icon = Res.Icon.android,
        iconDesc = "Android Icon",
        title = "Android Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    IOS(
        icon = Res.Icon.apple,
        iconDesc = "Apple Icon",
        title = "iOS Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    Web(
        icon = Res.Icon.web,
        iconDesc = "Desktop Icon",
        title = "Web Development",
        description = LOREM_IPSUM_SHORTEST
    ),
    Design(
        icon = Res.Icon.design,
        iconDesc = "Pen Icon",
        title = "UX/UI Design",
        description = LOREM_IPSUM_SHORTEST
    ),
    Business(
        icon = Res.Icon.business,
        iconDesc = "Chart Icon",
        title = "Business Analysis",
        description = LOREM_IPSUM_SHORTEST
    ),
    SEO(
        icon = Res.Icon.seo,
        iconDesc = "Megaphone Icon",
        title = "SEO Marketing",
        description = LOREM_IPSUM_SHORTEST
    )
}