package com.vytautasdev.sections

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.*
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.vytautasdev.components.AchievementCard
import com.vytautasdev.models.Achievement
import com.vytautasdev.models.Section
import com.vytautasdev.models.Theme
import com.vytautasdev.utils.Constants.SECTION_HEIGHT
import com.vytautasdev.utils.Constants.SECTION_WIDTH
import com.vytautasdev.utils.ObserveViewportEntered
import com.vytautasdev.utils.animateNumbers
import kotlinx.coroutines.launch
import org.jetbrains.compose.web.css.px

@Composable
fun AchievementsSection() {
    val breakpoint = rememberBreakpoint()
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .id(Section.Achievements.id)
            .maxWidth(SECTION_WIDTH.px)
            .backgroundColor(Theme.LighterGray.rgb)
            .padding(topBottom = 100.px),
        contentAlignment = Alignment.Center
    ) {
        AchievementsContent(breakpoint = breakpoint)
    }
}

@Composable
fun AchievementsContent(breakpoint: Breakpoint) {

    val scope = rememberCoroutineScope()
    var viewPortEntered by remember { mutableStateOf(false) }
    val animatedNumbers = remember { mutableStateListOf(0, 0, 0, 0) }

    ObserveViewportEntered(
        sectionId = Section.Achievements.id,
        distanceFromTop = SECTION_HEIGHT.toDouble(),
        onViewportEntered = {
            viewPortEntered = true
            Achievement.values().forEach { achievement ->
                scope.launch {
                    animateNumbers(
                        number = achievement.number,
                        onUpdate = {
                            animatedNumbers[achievement.ordinal] = it
                        }
                    )
                }
            }
        }
    )

    SimpleGrid(numColumns = numColumns(base = 1, md = 2, lg = 4)) {
        Achievement.values().forEach { achievement ->
            AchievementCard(
                modifier = Modifier
                    .margin(
                        right = if (achievement == Achievement.Team) 0.px
                        else {
                            if (breakpoint > Breakpoint.SM) 40.px else 0.px
                        },
                        bottom = if (breakpoint > Breakpoint.MD) 0.px else 40.px
                    ),
                animatedNumber = if (viewPortEntered) animatedNumbers[achievement.ordinal] else 0,
                achievement = achievement
            )
        }
    }
}
