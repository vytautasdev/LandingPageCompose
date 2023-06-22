package com.vytautasdev.models


import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.percent

enum class Skill(
    val title: String,
    val percentage: CSSSizeValue<CSSUnit.percent>
) {
    ProblemSolvingSkills(
        title = "Strong analytical & problem-solving skills",
        percentage = 90.percent
    ),
    CommunicationSkills(
        title = "Excellent communication skills",
        percentage = 100.percent
    ),
    AttentionToDetail(
        title = "Good eye for detail",
        percentage = 95.percent
    ),
    Creative(
        title = "Creative",
        percentage = 80.percent
    ),
    Adaptable(
        title = "Adaptable",
        percentage = 90.percent
    ),
    Responsible(
        title = "Responsible",
        percentage = 95.percent
    ),
    Trustworthy(
        title = "Trustworthy",
        percentage = 100.percent
    ),
    HardWorking(
        title = "Hard working",
        percentage = 85.percent
    )
}

