#![allow(unused_imports, unused_qualifications, unused_extern_crates)]
extern crate chrono;
extern crate uuid;


use serde::ser::Serializer;

use std::collections::HashMap;
use models;
use swagger;


/// The current player, demo and legacy status of a player identified by the id
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct CurrentPlayerIDs {
    /// The player UUID without hyphens
    #[serde(rename = "id")]
    pub id: String,

    /// The current name being used by this player
    #[serde(rename = "name")]
    pub name: String,

    /// If account has not been converted
    #[serde(rename = "legacy")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub legacy: Option<bool>,

    /// If the player has not puchased the game
    #[serde(rename = "demo")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub demo: Option<bool>,

}

impl CurrentPlayerIDs {
    pub fn new(id: String, name: String, ) -> CurrentPlayerIDs {
        CurrentPlayerIDs {
            id: id,
            name: name,
            legacy: Some(false),
            demo: Some(false),
        }
    }
}

/// This is returned when the request fails
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct Error {
    #[serde(rename = "error")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub error: Option<String>,

    #[serde(rename = "errorMessage")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub error_message: Option<String>,

}

impl Error {
    pub fn new() -> Error {
        Error {
            error: None,
            error_message: None,
        }
    }
}

#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject {
    #[serde(rename = "model")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub model: Option<models::SkinModel>,

    /// The skin image in PNG format
    #[serde(rename = "file")]
    pub file: swagger::ByteArray,

}

impl InlineObject {
    pub fn new(file: swagger::ByteArray, ) -> InlineObject {
        InlineObject {
            model: None,
            file: file,
        }
    }
}

/// Request Mojang to download a skin from an URL and apply to the player
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct InlineObject1 {
    #[serde(rename = "model")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub model: Option<models::SkinModel>,

    /// The URL which Mojang servers will download and apply the skin
    #[serde(rename = "url")]
    pub url: String,

}

impl InlineObject1 {
    pub fn new(url: String, ) -> InlineObject1 {
        InlineObject1 {
            model: None,
            url: url,
        }
    }
}

/// A registered name change.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct NameChange {
    /// The new player name
    #[serde(rename = "name")]
    pub name: String,

    /// Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
    #[serde(rename = "changedToAt")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub changed_to_at: Option<i64>,

}

impl NameChange {
    pub fn new(name: String, ) -> NameChange {
        NameChange {
            name: name,
            changed_to_at: None,
        }
    }
}

/// Valid options to query the order statistics
/// Enumeration of values.
/// Since this enum's variants do not hold data, we can easily define them them as `#[repr(C)]`
/// which helps with FFI.
#[allow(non_camel_case_types)]
#[repr(C)]
#[derive(Debug, Clone, Copy, PartialEq, PartialOrd, Serialize, Deserialize, Eq, Ord)]
pub enum OrderStatistic { 
    #[serde(rename = "item_sold_minecraft")]
    ITEM_SOLD_MINECRAFT,
    #[serde(rename = "prepaid_card_redeemed_minecraft")]
    PREPAID_CARD_REDEEMED_MINECRAFT,
    #[serde(rename = "item_sold_cobalt")]
    ITEM_SOLD_COBALT,
    #[serde(rename = "item_sold_scrolls")]
    ITEM_SOLD_SCROLLS,
    #[serde(rename = "prepaid_card_redeemed_cobalt")]
    PREPAID_CARD_REDEEMED_COBALT,
    #[serde(rename = "item_sold_dungeons")]
    ITEM_SOLD_DUNGEONS,
}

impl ::std::fmt::Display for OrderStatistic {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        match *self { 
            OrderStatistic::ITEM_SOLD_MINECRAFT => write!(f, "{}", "item_sold_minecraft"),
            OrderStatistic::PREPAID_CARD_REDEEMED_MINECRAFT => write!(f, "{}", "prepaid_card_redeemed_minecraft"),
            OrderStatistic::ITEM_SOLD_COBALT => write!(f, "{}", "item_sold_cobalt"),
            OrderStatistic::ITEM_SOLD_SCROLLS => write!(f, "{}", "item_sold_scrolls"),
            OrderStatistic::PREPAID_CARD_REDEEMED_COBALT => write!(f, "{}", "prepaid_card_redeemed_cobalt"),
            OrderStatistic::ITEM_SOLD_DUNGEONS => write!(f, "{}", "item_sold_dungeons"),
        }
    }
}

impl ::std::str::FromStr for OrderStatistic {
    type Err = ();
    fn from_str(s: &str) -> Result<Self, Self::Err> {
        match s {
            "item_sold_minecraft" => Ok(OrderStatistic::ITEM_SOLD_MINECRAFT),
            "prepaid_card_redeemed_minecraft" => Ok(OrderStatistic::PREPAID_CARD_REDEEMED_MINECRAFT),
            "item_sold_cobalt" => Ok(OrderStatistic::ITEM_SOLD_COBALT),
            "item_sold_scrolls" => Ok(OrderStatistic::ITEM_SOLD_SCROLLS),
            "prepaid_card_redeemed_cobalt" => Ok(OrderStatistic::PREPAID_CARD_REDEEMED_COBALT),
            "item_sold_dungeons" => Ok(OrderStatistic::ITEM_SOLD_DUNGEONS),
            _ => Err(()),
        }
    }
}

/// The body of the request to get the order statistics
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct OrderStatisticsRequest {
    #[serde(rename = "metricKeys")]
    pub metric_keys: Vec<models::OrderStatistic>,

}

impl OrderStatisticsRequest {
    pub fn new(metric_keys: Vec<models::OrderStatistic>, ) -> OrderStatisticsRequest {
        OrderStatisticsRequest {
            metric_keys: metric_keys,
        }
    }
}

/// A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct OrderStatisticsResponse {
    /// total amount sold
    #[serde(rename = "total")]
    pub total: i64,

    /// total sold in last 24 hours
    #[serde(rename = "last24h")]
    pub last24h: i64,

    /// decimal average sales per second
    #[serde(rename = "saleVelocityPerSeconds")]
    pub sale_velocity_per_seconds: f64,

}

impl OrderStatisticsResponse {
    pub fn new(total: i64, last24h: i64, sale_velocity_per_seconds: f64, ) -> OrderStatisticsResponse {
        OrderStatisticsResponse {
            total: total,
            last24h: last24h,
            sale_velocity_per_seconds: sale_velocity_per_seconds,
        }
    }
}

/// A security question answer given by the player using the id given by Mojang
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SecurityAnswer {
    /// A number giver by Mojang to reply a question
    #[serde(rename = "id")]
    pub id: i32,

}

impl SecurityAnswer {
    pub fn new(id: i32, ) -> SecurityAnswer {
        SecurityAnswer {
            id: id,
        }
    }
}

/// A security question answer id given by Mojang
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SecurityAnswerId {
    /// A number giver by Mojang to reply a question
    #[serde(rename = "id")]
    pub id: i32,

}

impl SecurityAnswerId {
    pub fn new(id: i32, ) -> SecurityAnswerId {
        SecurityAnswerId {
            id: id,
        }
    }
}

/// Binds a question to an answer id, the answer must respect the answer id.
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SecurityChallenge {
    #[serde(rename = "question")]
    pub question: models::SecurityQuestion,

    #[serde(rename = "answer")]
    pub answer: models::SecurityAnswerId,

}

impl SecurityChallenge {
    pub fn new(question: models::SecurityQuestion, answer: models::SecurityAnswerId, ) -> SecurityChallenge {
        SecurityChallenge {
            question: question,
            answer: answer,
        }
    }
}

/// A security question requested by Mojang
#[derive(Debug, Clone, PartialEq, Serialize, Deserialize)]
pub struct SecurityQuestion {
    /// The possible IDs are these:   1  What is your favorite pet's name?   2  What is your favorite movie?   3  What is your favorite author's last name?   4  What is your favorite artist's last name?   5  What is your favorite actor's last name?   6  What is your favorite activity?   7  What is your favorite restaurant?   8  What is the name of your favorite cartoon?   9  What is the name of the first school you attended?   10 What is the last name of your favorite teacher?   11 What is your best friend's first name?   12 What is your favorite cousin's name?   13 What was the first name of your first girl/boyfriend?   14 What was the name of your first stuffed animal?   15 What is your mother's middle name?   16 What is your father's middle name?   17 What is your oldest sibling's middle name?   18 In what city did your parents meet?   19 In what hospital were you born?   20 What is your favorite team?   21 How old were you when you got your first computer?   22 How old were you when you got your first gaming console?   23 What was your first video game?   24 What is your favorite card game?   25 What is your favorite board game?   26 What was your first gaming console?   27 What was the first book you ever read?   28 Where did you go on your first holiday?   29 In what city does your grandmother live?   30 In what city does your grandfather live?   31 What is your grandmother's first name?   32 What is your grandfather's first name?   33 What is your least favorite food?   34 What is your favorite ice cream flavor?   35 What is your favorite ice cream flavor?   36 What is your favorite place to visit?   37 What is your dream job?   38 What color was your first pet?   39 What is your lucky number?
    #[serde(rename = "id")]
    pub id: i32,

    /// The question itself
    #[serde(rename = "question")]
    pub question: String,

}

impl SecurityQuestion {
    pub fn new(id: i32, question: String, ) -> SecurityQuestion {
        SecurityQuestion {
            id: id,
            question: question,
        }
    }
}

/// Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
/// Enumeration of values.
/// Since this enum's variants do not hold data, we can easily define them them as `#[repr(C)]`
/// which helps with FFI.
#[allow(non_camel_case_types)]
#[repr(C)]
#[derive(Debug, Clone, Copy, PartialEq, PartialOrd, Serialize, Deserialize, Eq, Ord)]
pub enum SkinModel { 
    #[serde(rename = "")]
    ,
    #[serde(rename = "slim")]
    SLIM,
}

impl ::std::fmt::Display for SkinModel {
    fn fmt(&self, f: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        match *self { 
            SkinModel:: => write!(f, "{}", ""),
            SkinModel::SLIM => write!(f, "{}", "slim"),
        }
    }
}

impl ::std::str::FromStr for SkinModel {
    type Err = ();
    fn from_str(s: &str) -> Result<Self, Self::Err> {
        match s {
            "" => Ok(SkinModel::),
            "slim" => Ok(SkinModel::SLIM),
            _ => Err(()),
        }
    }
}
