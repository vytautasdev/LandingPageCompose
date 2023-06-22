package com.vytautasdev.models


import com.vytautasdev.utils.Constants.LOREM_IPSUM_SHORT
import com.vytautasdev.utils.Res

enum class Testimonial(
    val image: String,
    val fullName: String,
    val profession: String,
    val review: String
) {
    First(
        image = Res.Image.avatar1,
        fullName = "Jane Doe",
        profession = "Web Developer",
        review = LOREM_IPSUM_SHORT
    ),
    Second(
        image = Res.Image.avatar2,
        fullName = "Vin Diesel",
        profession = "Actor and film producer",
        review = LOREM_IPSUM_SHORT
    ),
    Third(
        image = Res.Image.avatar3,
        fullName = "Jessica Simpson",
        profession = "Business Analyst",
        review = LOREM_IPSUM_SHORT
    ),
    Fourth(
        image = Res.Image.avatar4,
        fullName = "John Smith",
        profession = "Software Engineering Manager",
        review = LOREM_IPSUM_SHORT
    ),
    Fifth(
        image = Res.Image.avatar5,
        fullName = "Kelly Clarkson",
        profession = "HR Recruiter",
        review = LOREM_IPSUM_SHORT
    ),
    Sixth(
        image = Res.Image.avatar6,
        fullName = "John Doe",
        profession = "Cyber Security Analyst",
        review = LOREM_IPSUM_SHORT
    )
}