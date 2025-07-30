# 📱 Campus Placement Prediction App

An Android application designed to help assess student placement readiness based on academic details, test scores, and skill evaluations. Built for Training & Placement Officers (TPOs) to monitor students in real-time.

## 🚀 Features

- 👤 Student Registration & Login (Firebase Authentication)
- ☁️ Realtime data storage using Firebase Realtime Database
- 🔍 Rule-based logic to classify students:
  - ✅ **Ready for Placement**
  - ⚠️ **At Risk**
- 📋 Form to enter academic data (10th, 12th, Degree marks)
- 📝 Internal/Skill test input with result evaluation
- 🛡️ Admin dashboard to monitor student status

## 🛠️ Tech Stack

- **Platform**: Android (Java or Kotlin)
- **IDE**: Android Studio
- **Backend**: Firebase
  - Authentication
  - Realtime Database
- **UI**: XML + Material Design

## 🧠 Prediction Logic

The app uses **rule-based evaluation**, not machine learning. Example:

- If 10th %, 12th %, Degree % > 60
- AND Skill Test Score > 60%
- THEN: ✅ **Ready**
- ELSE: ⚠️ **At Risk**

> Logic is defined in utility classes or main activity (e.g., `Predictor.java` or `MainActivity.java`).

## 🔧 How to Run

1. Open the project in **Android Studio**
2. Connect Firebase:
   - Add `google-services.json` in `/app`
   - Enable Firebase Auth & Realtime Database
3. Click ▶️ Run on emulator or real device

## 🧑‍💻 Developer

Made with ❤️ by Roshan Dandge , Rushikesh Joshi , Vijay Shilwant , Shreyash Rajput 
               
