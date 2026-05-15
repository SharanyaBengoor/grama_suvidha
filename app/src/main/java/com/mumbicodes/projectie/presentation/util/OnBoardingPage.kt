package com.mumbicodes.projectie.presentation.util

import androidx.annotation.DrawableRes
import com.mumbicodes.projectie.R

sealed class OnBoardingPage(
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
) {

    object Screen1 : OnBoardingPage(
        image = R.drawable.onboarding_illustration,
        title = "Track Village Development",
        description = "View ongoing government works and monitor development progress in your village.",
    )

    object Screen2 : OnBoardingPage(
        image = R.drawable.get_notified_illustration,
        title = "Stay Informed",
        description = "Receive public notices and stay updated on local infrastructure projects.",
    )
}