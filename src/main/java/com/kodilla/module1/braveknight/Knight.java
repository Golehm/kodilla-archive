package com.kodilla.module1.braveknight;

class Knight {

    private Quest quest;

    Knight(Quest quest) {
        this.quest = quest;
    }

    public void callQuest(Quest quest) {
        quest.process();
    }

}
