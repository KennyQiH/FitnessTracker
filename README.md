# FitnessTracker
Classes Done:
- All Classes.
- New Classes have been completed as well.

Classes Work in Progress:
- None.

Good news:
- Changes have made so that it uses multiple windows and it saves uses less code
- Added negative feedback for invalid inputs for all classes in need of it

Not as good news:
- To make use of the user class two more classes had to be made


(Please put here if anything you want to add)
Things to add:
- Units - done
- Formatting update - done







## Class Diagram
```mermaid
%%{init: {'theme':'forest'}}%%
classDiagram
    JFrame <|-- FitnessGUI
    FitnessGUI *-- Workout
    FitnessGUI *-- Goals
    FitnessGUI *-- Progress

    JFrame <|-- Goals
    JFrame <|-- Login
    JFrame <|-- Progress
    JFrame <|-- Workout 
    namespace Java {
        class JFrame {

        }
    }
    namespace FitnessTrackerProject {
        class FitnessGUI {
        }
        class FitnessTracker {
        }
        class Goals {

        }
        class Progress {

        }
        class Login {

        }
        class Progress {

        }
        class User {
        }
        class UserSession {

        }
        class Workout {

        }
    }
```
