package com.mumbicodes.projectie.domain.model

data class ProjectJson(
    val projectName: String,
    val projectDesc: String,
    val projectDeadline: String,
    val projectStatus: String,
    val progressPercent: Int
)