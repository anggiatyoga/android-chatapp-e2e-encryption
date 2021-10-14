package com.anggiat.chatapp.listeners;

import com.anggiat.chatapp.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
